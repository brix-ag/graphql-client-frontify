package ch.brix.gql.client.frontify.builders;

public class On_CreateAssetVariant extends ch.brix.gql.client.TypeBuilder {
  public On_CreateAssetVariant() {
    super(new ch.brix.gql.client.On("CreateAssetVariant"));
  }
  /**
   * The newly created `AssetVariant` processing job response.
   */
  public On_CreateAssetVariant job(CreateAssetVariant_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
