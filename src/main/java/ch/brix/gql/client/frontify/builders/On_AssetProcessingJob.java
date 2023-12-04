package ch.brix.gql.client.frontify.builders;

public class On_AssetProcessingJob extends ch.brix.gql.client.TypeBuilder {
  public On_AssetProcessingJob() {
    super(new ch.brix.gql.client.On("AssetProcessingJob"));
  }
  /**
   * `Asset` Id.
   */
  public On_AssetProcessingJob assetId() {
    _add_field("assetId");
    return this;
  }
}
