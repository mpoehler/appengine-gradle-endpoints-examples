package de.example;

/**
 * Created by mpoehler@gmail.com on 21.10.16.
 */

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@Api(name = "myApi", version = "v1",
        scopes = { "https://www.googleapis.com/auth/userinfo.email" },
        clientIds = {
                // this is to give the api explorer access
                com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID,

                // this client id is created here: https://console.cloud.google.com/apis/credentials
                // Use OAuth ClientID for Webapplication, maybe you need to configure the consent screen first (just add a product name)
                // You'll need to add "Authorized JavaScript origins" in the form: https://appid.appspot.com
                "1065372429076-g8por2o8vlug3dtgf1i7n96i5nq51d4b.apps.googleusercontent.com"
        }
)
public class ExampleEndpoint {

    private static final Logger log = Logger.getLogger(ExampleEndpoint.class.getName());

    @ApiMethod(name = "example.getName", path = "example.getName")
    public Collection<String> getName() {

        log.info("call to example.getName Endpoint");

        Set<String> set = new HashSet<>();
        set.add("This is from Example Endpoint");
        return set;
    }
}
