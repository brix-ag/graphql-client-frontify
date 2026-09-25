package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_assetsByExternalId extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryAssetsByExternalIdResult> {
  public DocumentLibrary_assetsByExternalId() {
    super(new ch.brix.gql.client.Call<>("assetsByExternalId", "LibraryAssetsByExternalIdResult"));
  }
  public DocumentLibrary_assetsByExternalId args(DocumentLibrary_assetsByExternalId_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public DocumentLibrary_assetsByExternalId onLibraryAssetsByExternalIdResult(On_LibraryAssetsByExternalIdResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
