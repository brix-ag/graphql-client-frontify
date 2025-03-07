package ch.brix.gql.client.frontify.builders;

public class CreativeExport_result extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreativeResult> {
  public CreativeExport_result() {
    super(new ch.brix.gql.client.Call<>("result", "CreativeResult"));
  }
  public CreativeExport_result onCreativeResult(On_CreativeResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
