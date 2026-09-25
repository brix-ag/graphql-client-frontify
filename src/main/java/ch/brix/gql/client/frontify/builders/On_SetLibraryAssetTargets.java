package ch.brix.gql.client.frontify.builders;

public class On_SetLibraryAssetTargets extends ch.brix.gql.client.TypeBuilder {
  public On_SetLibraryAssetTargets() {
    super(new ch.brix.gql.client.On("SetLibraryAssetTargets"));
  }
  /**
   * **BETA** The assets affected by the mutation.
   */
  public On_SetLibraryAssetTargets assets(SetLibraryAssetTargets_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
