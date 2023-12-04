package ch.brix.gql.client.frontify.builders;

public class Document_previewUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Document_previewUrl() {
    super(new ch.brix.gql.client.Call<>("previewUrl", "Url"));
  }
  public Document_previewUrl args(Document_previewUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
