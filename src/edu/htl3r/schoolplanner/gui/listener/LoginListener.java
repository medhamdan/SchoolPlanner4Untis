/* SchoolPlanner4Untis - Android app to manage your Untis timetable
    Copyright (C) 2011  Mathias Kub <mail@makubi.at>
			Sebastian Chlan <sebastian@schoolplanner.at>
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package edu.htl3r.schoolplanner.gui.listener;

import java.io.Serializable;

import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import edu.htl3r.schoolplanner.gui.SelectScreen;
import edu.htl3r.schoolplanner.gui.WelcomeScreen;

public class LoginListener implements OnItemClickListener, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WelcomeScreen welcomescreen;

	public LoginListener(WelcomeScreen ws) {
		welcomescreen = ws;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		//final LoginSet selectedEntry = welcomescreen.getLoginManager().getLoginSetOnPosition(position);

		AsyncTask<Void, Void, Void> task = new AsyncTask<Void, Void, Void>() {

			@Override
			protected Void doInBackground(Void... params) {				
				Intent t = new Intent(welcomescreen, SelectScreen.class);
				welcomescreen.startActivity(t);
			
				return null;
			}

			@Override
			protected void onPreExecute() {
				super.onPreExecute();
				welcomescreen.setInProgress("Login in progress...", true);
			}

			@Override
			protected void onPostExecute(Void result) {
				super.onPostExecute(result);
				welcomescreen.setInProgress("", false);
			}
		};

		task.execute();
	}

}
