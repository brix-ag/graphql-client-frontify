package ch.brix.gql.client.frontify.builders;

public class On_RemoveAssetLicense extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveAssetLicense() {
    super(new ch.brix.gql.client.On("RemoveAssetLicense"));
  }
  /**
   * `Asset` details.
   */
  public On_RemoveAssetLicense asset(RemoveAssetLicense_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `License` details.
   */
  public On_RemoveAssetLicense license(RemoveAssetLicense_license callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
