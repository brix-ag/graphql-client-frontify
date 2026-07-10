package ch.brix.gql.client.frontify.builders;

public class On_ReplaceAssetVariant extends ch.brix.gql.client.TypeBuilder {
  public On_ReplaceAssetVariant() {
    super(new ch.brix.gql.client.On("ReplaceAssetVariant"));
  }
  /**
   * The newly created `AssetVariant` processing job response.
   */
  public On_ReplaceAssetVariant job(ReplaceAssetVariant_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
