package ch.brix.gql.client.frontify.builders;

public class On_RemoveLibraryAssetTargets extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveLibraryAssetTargets() {
    super(new ch.brix.gql.client.On("RemoveLibraryAssetTargets"));
  }
  /**
   * **BETA** The assets affected by the mutation.
   */
  public On_RemoveLibraryAssetTargets assets(RemoveLibraryAssetTargets_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
