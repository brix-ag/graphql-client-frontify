package ch.brix.gql.client.frontify;

public class Client extends ch.brix.gql.client.Client {
  public Client(String endpoint, okhttp3.OkHttpClient client) {
    super(endpoint, client, new ch.brix.gql.client.frontify.lookup.TypeRegistry());
  }
  public Client(String endpoint) {
    super(endpoint, new ch.brix.gql.client.frontify.lookup.TypeRegistry());
  }
}
