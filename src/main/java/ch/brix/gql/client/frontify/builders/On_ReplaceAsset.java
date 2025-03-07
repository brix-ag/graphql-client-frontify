package ch.brix.gql.client.frontify.builders;

public class On_ReplaceAsset extends ch.brix.gql.client.TypeBuilder {
  public On_ReplaceAsset() {
    super(new ch.brix.gql.client.On("ReplaceAsset"));
  }
  /**
   * The newly created `Asset` processing job response.
   */
  public On_ReplaceAsset job(ReplaceAsset_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
