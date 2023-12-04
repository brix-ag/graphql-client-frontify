package ch.brix.gql.client.frontify.builders;

public class Audio_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Audio_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public Audio_downloadUrl args(Audio_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
