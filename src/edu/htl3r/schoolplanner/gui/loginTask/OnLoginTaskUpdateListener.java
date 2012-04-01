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
package edu.htl3r.schoolplanner.gui.loginTask;

import android.os.Bundle;

/**
 * Klassen, die sich mit diesem Listener am {@link LoginTask} angemeldet haben, erhalten Benachrichtigungen ueber den Login-Vorgang.
 */
public interface OnLoginTaskUpdateListener {
	/**
	 * Diese Methode wird aufgerufen, wenn sich der Status des {@link LoginTask} aendert.<br />
	 * Dies ist z.B. der Fall, wenn der Login oder das Herunterladen der Stammdaten erfolgreich durchgefuehrt werden konnten.
	 * @param status Status des {@link LoginTask}
	 * @see LoginTaskStatus
	 */
	public void statusChanged(String status);
	
	/**
	 * Diese Methode wird verwendet, um das Beenden des {@link LoginTask} zu kennzeichnen.<br />
	 * Daten, die beim Login geladen wurden (z.B. Stammdaten) werden in einem {@link Bundle} uebergeben.
	 * @param data Daten, die beim Login geladen wurden oder {@code null}, wenn der Login nicht erfolgreich war
	 */
	public void loginTaskFinished(Bundle data);
}
