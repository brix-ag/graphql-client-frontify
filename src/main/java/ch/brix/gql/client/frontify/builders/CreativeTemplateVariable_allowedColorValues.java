package ch.brix.gql.client.frontify.builders;

public class CreativeTemplateVariable_allowedColorValues extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CreativeColor>> {
  public CreativeTemplateVariable_allowedColorValues() {
    super(new ch.brix.gql.client.Call<>("allowedColorValues", "CreativeColor"));
  }
  public CreativeTemplateVariable_allowedColorValues onCreativeColor(On_CreativeColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
