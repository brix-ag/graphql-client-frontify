package ch.brix.gql.client.frontify;

public class ThrottledClient extends ch.brix.gql.client.ThrottledClient {
  public ThrottledClient(String endpoint, okhttp3.OkHttpClient client, long requests, long perSeconds) {
    super(endpoint, client, new ch.brix.gql.client.frontify.lookup.TypeRegistry(), requests, perSeconds);
  }
  public ThrottledClient(String endpoint, long requests, long perSeconds) {
    super(endpoint, new ch.brix.gql.client.frontify.lookup.TypeRegistry(), requests, perSeconds);
  }
}
