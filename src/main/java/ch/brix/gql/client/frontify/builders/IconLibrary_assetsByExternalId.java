package ch.brix.gql.client.frontify.builders;

public class IconLibrary_assetsByExternalId extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryAssetsByExternalIdResult> {
  public IconLibrary_assetsByExternalId() {
    super(new ch.brix.gql.client.Call<>("assetsByExternalId", "LibraryAssetsByExternalIdResult"));
  }
  public IconLibrary_assetsByExternalId args(IconLibrary_assetsByExternalId_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public IconLibrary_assetsByExternalId onLibraryAssetsByExternalIdResult(On_LibraryAssetsByExternalIdResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
