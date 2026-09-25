package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeLibraryAssetTargets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveLibraryAssetTargets> {
  public RootMutation_removeLibraryAssetTargets() {
    super(new ch.brix.gql.client.Call<>("removeLibraryAssetTargets", "RemoveLibraryAssetTargets"));
  }
  public RootMutation_removeLibraryAssetTargets args(RootMutation_removeLibraryAssetTargets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeLibraryAssetTargets onRemoveLibraryAssetTargets(On_RemoveLibraryAssetTargets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
