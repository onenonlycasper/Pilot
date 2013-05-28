/*
   Copyright (c) 2012 Emitrom LLC. All rights reserved. 
   For licensing questions, please contact us at licensing@emitrom.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.emitrom.pilot.device.client.globalization;

import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

public class GlobalizationOptions extends JsObject {
    public GlobalizationOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * @param value can be 'narrow', or 'wide'
     */
    public void setType(String value) {
        JsoHelper.setAttribute(jsObj, "type", value);
    }

    /**
     * @param value can be 'months', or 'days'
     */
    public void setItem(String value) {
        JsoHelper.setAttribute(jsObj, "item", value);
    }
    
    /**
     * @param value can be 'short', 'medium', 'long', or 'full'
     */
    public void setFormatLength(String value) {
        JsoHelper.setAttribute(jsObj, "formatLength", value);
    }

    /**
     * @param value can be 'date', 'time' or 'date and time'
     */
    public void setSelector(String value) {
        JsoHelper.setAttribute(jsObj, "selector", value);
    }

}
