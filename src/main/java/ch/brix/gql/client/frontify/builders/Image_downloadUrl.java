package ch.brix.gql.client.frontify.builders;

public class Image_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Image_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public Image_downloadUrl args(Image_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
