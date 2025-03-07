package ch.brix.gql.client.frontify.builders;

public class CreativeResult_asset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.File> {
  public CreativeResult_asset() {
    super(new ch.brix.gql.client.Call<>("asset", "File"));
  }
  public CreativeResult_asset onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
