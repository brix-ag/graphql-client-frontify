package ch.brix.gql.client.frontify.builders;

public class On_CreateAsset extends ch.brix.gql.client.TypeBuilder {
  public On_CreateAsset() {
    super(new ch.brix.gql.client.On("CreateAsset"));
  }
  /**
   * The newly created `Asset` processing job response.
   */
  public On_CreateAsset job(CreateAsset_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
