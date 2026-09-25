package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_assetsByExternalId extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryAssetsByExternalIdResult> {
  public LogoLibrary_assetsByExternalId() {
    super(new ch.brix.gql.client.Call<>("assetsByExternalId", "LibraryAssetsByExternalIdResult"));
  }
  public LogoLibrary_assetsByExternalId args(LogoLibrary_assetsByExternalId_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LogoLibrary_assetsByExternalId onLibraryAssetsByExternalIdResult(On_LibraryAssetsByExternalIdResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
