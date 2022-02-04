export default class PhoneNumberMasking {
    solution = (phone_number) => phone_number.replace(/[0-9](?=[0-9]{4})/g, "*");
}