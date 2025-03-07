package ch.brix.gql.client.frontify.builders;

public class On_CreateExternalAsset extends ch.brix.gql.client.TypeBuilder {
  public On_CreateExternalAsset() {
    super(new ch.brix.gql.client.On("CreateExternalAsset"));
  }
  /**
   * The newly created `Asset` processing job response.
   */
  public On_CreateExternalAsset job(CreateExternalAsset_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
