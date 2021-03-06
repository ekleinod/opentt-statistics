package de.edgesoft.statistics.controller;

import de.edgesoft.statistics.Statistics;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

/**
 * Controller for about text.
 *
 * ## Legal stuff
 *
 * Copyright 2015-2017 Ekkart Kleinod <ekleinod@edgesoft.de>
 *
 * The program is distributed under the terms of the GNU General Public License.
 *
 * See COPYING for details.
 *
 * This file is part of TT-Schiri: Statistics.
 *
 * TT-Schiri: Statistics is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TT-Schiri: Statistics is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TT-Schiri: Statistics.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Ekkart Kleinod
 * @version 0.1.0
 * @since 0.1.0
 */
public class AboutTextController {

	/**
	 * Email link.
	 *
	 * @param theEvent action event
	 */
	@FXML
	private void handleEmailLinkAction(final ActionEvent theEvent) {
		Statistics.hostServices.showDocument(String.format("mailto:%s", ((Hyperlink) theEvent.getTarget()).getText()));
	}

	/**
	 * Web link.
	 *
	 * @param theEvent action event
	 */
	@FXML
	private void handleWebLinkAction(final ActionEvent theEvent) {
		Statistics.hostServices.showDocument(((Hyperlink) theEvent.getTarget()).getText());
	}

}

/* EOF */
