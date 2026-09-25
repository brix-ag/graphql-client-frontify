package ch.brix.gql.client.frontify.builders;

public class Document_provenance extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetProvenance> {
  public Document_provenance() {
    super(new ch.brix.gql.client.Call<>("provenance", "AssetProvenance"));
  }
  public Document_provenance onAssetProvenance(On_AssetProvenance typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
