package ch.brix.gql.client.frontify.builders;

public class AssetAttachment_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public AssetAttachment_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public AssetAttachment_downloadUrl args(AssetAttachment_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
