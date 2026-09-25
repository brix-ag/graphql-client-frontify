package ch.brix.gql.client.frontify.builders;

public class File_provenance extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetProvenance> {
  public File_provenance() {
    super(new ch.brix.gql.client.Call<>("provenance", "AssetProvenance"));
  }
  public File_provenance onAssetProvenance(On_AssetProvenance typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
