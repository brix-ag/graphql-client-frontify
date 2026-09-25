package ch.brix.gql.client.frontify.builders;

public class GuidelineItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Guideline>> {
  public GuidelineItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Guideline"));
  }
  public GuidelineItems_items onGuideline(On_Guideline typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
