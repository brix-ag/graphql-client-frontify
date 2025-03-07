package ch.brix.gql.client.frontify.builders;

public class Image_previewUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Image_previewUrl() {
    super(new ch.brix.gql.client.Call<>("previewUrl", "Url"));
  }
  public Image_previewUrl args(Image_previewUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
