package ch.brix.gql.client.frontify.builders;

public class Video_previewUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Video_previewUrl() {
    super(new ch.brix.gql.client.Call<>("previewUrl", "Url"));
  }
  public Video_previewUrl args(Video_previewUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
