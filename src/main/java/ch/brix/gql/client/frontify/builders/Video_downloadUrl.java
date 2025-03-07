package ch.brix.gql.client.frontify.builders;

public class Video_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Video_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public Video_downloadUrl args(Video_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
