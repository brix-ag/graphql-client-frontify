package ch.brix.gql.client.frontify.builders;

public class On_RemoveAssetPreviewImage extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveAssetPreviewImage() {
    super(new ch.brix.gql.client.On("RemoveAssetPreviewImage"));
  }
  /**
   * `Asset` details.
   */
  public On_RemoveAssetPreviewImage asset(RemoveAssetPreviewImage_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
