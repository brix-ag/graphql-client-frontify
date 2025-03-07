package ch.brix.gql.client.frontify.builders;

public class On_MoveAssets extends ch.brix.gql.client.TypeBuilder {
  public On_MoveAssets() {
    super(new ch.brix.gql.client.On("MoveAssets"));
  }
  /**
   * List of moved `Asset` items.
   */
  public On_MoveAssets assets(MoveAssets_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
