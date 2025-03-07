package ch.brix.gql.client.frontify.builders;

public class Document_availability extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DateTimeRange> {
  public Document_availability() {
    super(new ch.brix.gql.client.Call<>("availability", "DateTimeRange"));
  }
  public Document_availability onDateTimeRange(On_DateTimeRange typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
