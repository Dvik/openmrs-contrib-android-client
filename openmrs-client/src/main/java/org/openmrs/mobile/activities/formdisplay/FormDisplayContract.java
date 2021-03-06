/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */

package org.openmrs.mobile.activities.formdisplay;

import android.app.Fragment;
import android.widget.LinearLayout;

import org.openmrs.mobile.activities.BasePresenter;
import org.openmrs.mobile.activities.BaseView;
import org.openmrs.mobile.models.retrofit.Question;
import org.openmrs.mobile.utilities.InputField;

import java.lang.ref.WeakReference;
import java.util.List;

public interface FormDisplayContract {

    interface View extends BaseView<Presenter> {

        interface MainView extends View {
            void quitFormEntry();
        }

        interface PageView extends View {
            void attachSectionToView(LinearLayout linearLayout);
            void attachQuestionToSection(LinearLayout section, LinearLayout question);
            void createAndAttachNumericQuestionEditText(Question question, LinearLayout sectionLinearLayout);
            LinearLayout createQuestionGroupLayout(String questionLabel);
            LinearLayout createSectionLayout(String sectionLabel);
            List<InputField> getInputFields();
        }

    }

    interface Presenter extends BasePresenter {

        interface MainPresenter extends Presenter {
            void createEncounter();
            void addFragment(Fragment fragment);
        }

        interface PagePresenter extends Presenter{}

    }

}
