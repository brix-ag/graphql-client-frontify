package ch.brix.gql.client.frontify.builders;

public class MetadataField_values extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.MetadataFieldValues>> {
  public MetadataField_values() {
    super(new ch.brix.gql.client.Call<>("values", "MetadataFieldValues"));
  }
  public MetadataField_values onMetadataFieldValues(On_MetadataFieldValues typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
