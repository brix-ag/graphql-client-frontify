package ch.brix.gql.client.frontify.builders;

public class Video_availability extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DateTimeRange> {
  public Video_availability() {
    super(new ch.brix.gql.client.Call<>("availability", "DateTimeRange"));
  }
  public Video_availability onDateTimeRange(On_DateTimeRange typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
