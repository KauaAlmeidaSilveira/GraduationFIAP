package br.com.fiap.services;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import br.com.fiap.model.Endereco;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ViaCepService {

    public Endereco getEndereco(String cep) throws IOException {

        HttpGet request = new HttpGet("http://viacep.com.br/ws/" + cep + "/json/");

        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        CloseableHttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();

        Endereco endereco = null;
        if (entity != null) {

            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            endereco = gson.fromJson(result, Endereco.class);

        }

        return endereco;
    }

}
