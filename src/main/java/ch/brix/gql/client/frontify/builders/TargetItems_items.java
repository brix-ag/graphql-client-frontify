package ch.brix.gql.client.frontify.builders;

public class TargetItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Target>> {
  public TargetItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Target"));
  }
  public TargetItems_items onTarget(On_Target typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
