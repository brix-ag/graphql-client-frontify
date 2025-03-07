package ch.brix.gql.client.frontify.builders;

public class On_UpdateAsset extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateAsset() {
    super(new ch.brix.gql.client.On("UpdateAsset"));
  }
  /**
   * `Asset` details.
   */
  public On_UpdateAsset asset(UpdateAsset_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
