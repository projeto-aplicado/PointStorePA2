package rest;

import java.util.Collection;

import br.com.pointstore.model.Usuario;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by root on 21/03/17.
 */

public interface LoginService {

    @GET("/PointStoreWeb/rest/usuarioLogin")
    Call<Collection<Usuario>> logar();
}
