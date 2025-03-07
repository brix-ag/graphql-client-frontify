package ch.brix.gql.client.frontify.builders;

public class Document_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public Document_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public Document_downloadUrl args(Document_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
