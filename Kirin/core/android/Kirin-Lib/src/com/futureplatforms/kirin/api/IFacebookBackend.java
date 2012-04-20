/*
   Copyright 2011 Future Platforms

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


package com.futureplatforms.kirin.api;

import org.json.JSONObject;

import com.futureplatforms.kirin.services.IPlatformService;

public interface IFacebookBackend extends IPlatformService {
	void procureAccessToken_(JSONObject params);

	void handlePostRequest_(JSONObject params);

	void showErrorMessage_(String title, String msg);
}
