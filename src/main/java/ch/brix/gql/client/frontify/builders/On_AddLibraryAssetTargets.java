package ch.brix.gql.client.frontify.builders;

public class On_AddLibraryAssetTargets extends ch.brix.gql.client.TypeBuilder {
  public On_AddLibraryAssetTargets() {
    super(new ch.brix.gql.client.On("AddLibraryAssetTargets"));
  }
  /**
   * **BETA** The assets affected by the mutation.
   */
  public On_AddLibraryAssetTargets assets(AddLibraryAssetTargets_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
