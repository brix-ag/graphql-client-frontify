package ch.brix.gql.client.frontify.builders;

public class AssetVariant_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public AssetVariant_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public AssetVariant_downloadUrl args(AssetVariant_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
