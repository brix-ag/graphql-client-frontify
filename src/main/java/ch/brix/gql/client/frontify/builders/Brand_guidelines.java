package ch.brix.gql.client.frontify.builders;

public class Brand_guidelines extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelineItems> {
  public Brand_guidelines() {
    super(new ch.brix.gql.client.Call<>("guidelines", "GuidelineItems"));
  }
  public Brand_guidelines args(Brand_guidelines_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_guidelines onGuidelineItems(On_GuidelineItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
