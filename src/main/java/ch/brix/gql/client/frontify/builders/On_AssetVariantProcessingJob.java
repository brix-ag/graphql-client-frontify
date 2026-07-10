package ch.brix.gql.client.frontify.builders;

public class On_AssetVariantProcessingJob extends ch.brix.gql.client.TypeBuilder {
  public On_AssetVariantProcessingJob() {
    super(new ch.brix.gql.client.On("AssetVariantProcessingJob"));
  }
  /**
   * `AssetVariant` Id.
   */
  public On_AssetVariantProcessingJob variantId() {
    _add_field("variantId");
    return this;
  }
}
