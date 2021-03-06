/**
 * Copyright (C) 2011 Simao Fontes <simao.fontes@fccn.pt>
 * Copyright (C) 2011 SAW Group - FCCN <saw@asa.fccn.pt>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.fccn.arquivo.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Simao Fontes
 *
 */
@RunWith(Suite.class)
/*@SuiteClasses({ TestSearchOneTerm.class,HighlightsTest.class, 
        TermsAndConditionsTest.class, TestSponsorImage.class, TestSearchOneTermOpenSearch.class,TestArcproxy.class,AdvancedTest.class,UrlsearchTest.class, ReplayTest.class })*/
@SuiteClasses({ TestSearchOneTerm.class,HighlightsTest.class, 
    TermsAndConditionsTest.class, TestSponsorImage.class, TestSearchOneTermOpenSearch.class,TestArcproxy.class,AdvancedTest.class, ReplayTest.class, UrlsearchTest.class })

public class AllTests {

}