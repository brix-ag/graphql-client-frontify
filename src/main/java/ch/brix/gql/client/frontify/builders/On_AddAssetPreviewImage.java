package ch.brix.gql.client.frontify.builders;

public class On_AddAssetPreviewImage extends ch.brix.gql.client.TypeBuilder {
  public On_AddAssetPreviewImage() {
    super(new ch.brix.gql.client.On("AddAssetPreviewImage"));
  }
  /**
   * The newly created `Asset` preview image processing job response.
   */
  public On_AddAssetPreviewImage job(AddAssetPreviewImage_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
