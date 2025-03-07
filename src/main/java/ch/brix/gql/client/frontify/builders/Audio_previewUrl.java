package ch.brix.gql.client.frontify.builders;

public class Audio_previewUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Audio_previewUrl() {
    super(new ch.brix.gql.client.Call<>("previewUrl", "Url"));
  }
  public Audio_previewUrl args(Audio_previewUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
