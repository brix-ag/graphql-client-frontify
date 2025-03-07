package ch.brix.gql.client.frontify.builders;

public class On_AssetPreviewProcessingJob extends ch.brix.gql.client.TypeBuilder {
  public On_AssetPreviewProcessingJob() {
    super(new ch.brix.gql.client.On("AssetPreviewProcessingJob"));
  }
  /**
   * `Asset` Id.
   */
  public On_AssetPreviewProcessingJob assetId() {
    _add_field("assetId");
    return this;
  }
}
