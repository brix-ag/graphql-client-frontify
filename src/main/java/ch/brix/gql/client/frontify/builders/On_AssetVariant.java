package ch.brix.gql.client.frontify.builders;

public class On_AssetVariant extends ch.brix.gql.client.TypeBuilder {
  public On_AssetVariant() {
    super(new ch.brix.gql.client.On("AssetVariant"));
  }
  /**
   * The key to identify the variant.
   */
  public On_AssetVariant key() {
    _add_field("key");
    return this;
  }
  /**
   * Filename of the `AssetVariant` `File`.
   */
  public On_AssetVariant filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Signed `Url` to download the original `AssetVariant` from Frontify.
   */
  public On_AssetVariant downloadUrl(AssetVariant_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
